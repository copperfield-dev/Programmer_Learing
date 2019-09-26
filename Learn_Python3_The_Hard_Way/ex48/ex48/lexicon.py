
direction_words = ["north", "south", "east", "west", 
                   "down", "up", "left", "right", "back"]

verbs = ["go", "stop", "kill", "eat"]

stop_words = ["the", "in", "of", "from", "at", "it"]

nouns = ["door", "bear", "princess", "cabinet"]

def scan(stuff):
    
    words = stuff.split()

    lexicon_lists = []

    for word in words:

        # if word is a direction word
        if word in direction_words:
            lexicon_lists.append(('direction', word))

        # if word is a verb
        elif word in verbs:
            lexicon_lists.append(('verb', word))

        # if word is a stop words
        elif word in stop_words:
            lexicon_lists.append(('stop', word))

        # if word is a noun
        elif word in nouns:
            lexicon_lists.append(("noun", word))
        
        # if word is number
        elif convert_number(word) != None:
            lexicon_lists.append(('number', int(word)))

        # input error word
        else:
            lexicon_lists.append(('error', word))
        
    print(lexicon_lists)
    return lexicon_lists

def convert_number(s):
    try:
        return int(s) 
    except ValueError:
        return None

if __name__ == '__main__':
    scan("north")
    scan("north south east")
    scan("go")
    scan("go kill eat")
    scan("the")
    scan("the in of")
    scan("bear")
    scan("bear princess")
    scan("1234")
    scan("3 91234")
    scan("ASDFADFASDF")
    scan("bear IAS princess")
