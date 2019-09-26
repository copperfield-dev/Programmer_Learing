from flask import Flask, session, redirect, url_for, request
from flask import render_template
from gothonweb import planisphere
from gothonweb import action_display
from random import randint

app = Flask(__name__)

@app.route("/")
def index():
    # this is used to "setup" the session with starting values: central_corridor
    session['room_name'] = planisphere.START
    session['display'] = None
    code = f"{randint(1, 9)}{randint(1, 9)}{randint(1, 9)}"
    session['code'] = code
    session['guesses'] = 0
    good_pod = randint(1, 5)
    session['good_pod'] = good_pod
    return redirect(url_for("game"))


@app.route("/game", methods=['GET', 'POST'])
def game():
    room_name = session.get("room_name")
    display = session.get("display")

    room = planisphere.load_room(room_name)
    if request.method == "GET":

        if room_name != 'Death':
            return render_template("show_room.html", room=room, display=display)
        else:
            return render_template("you_died.html", room=room, display=display)
    else:
        action = request.form.get('action')   

        if room_name == "Laser Weapon Armory":
            guess = request.form.get('code')
            if guess != session['code']:
                session['guesses'] = session['guesses'] + 1
                if session['guesses'] >= 10:
                    action = "guess error"
                    next_room = room.go(action)
                    display = action_display.load_display(action)
                    session['display'] = display
                    session['room_name'] = planisphere.name_room(next_room)
            else:
                action = "guess correct"
                next_room = room.go(action)
                display = action_display.load_display(action)
                session['display'] = display
                session['room_name'] = planisphere.name_room(next_room)
        elif room_name == "Escape Pod":
            guess = int(request.form.get('pod'))
            if guess == session['good_pod']:
                action = "good pod"
            else:
                action = "wrong pod"

            next_room = room.go(action)
            next_room.update_description(next_room.description.replace('{good_pod}', str(session['good_pod'])))
            session['display'] = display
            session['room_name'] = planisphere.name_room(next_room)
        elif room_name and action:
            room = planisphere.load_room(room_name)
            next_room = room.go(action)
            display = action_display.load_display(action)

            session['display'] = display

            if not next_room:
                session['room_name'] = planisphere.name_room(room)
            else:
                session['room_name'] = planisphere.name_room(next_room)

        return redirect(url_for("game"))

# YOU SHOULD CHANGE THIS IF YOU PUT ON THE INTERNET 
app.secret_key = 'A0Zr98j/3yX R~XHH!jmN]LWX/,?RT'


if __name__ == "__main__":
    app.run()

