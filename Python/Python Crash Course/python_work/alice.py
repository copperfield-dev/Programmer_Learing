from pathlib import Path  

path = Path('text_files/alice.txt')
try:
    contents = path.read_text(encoding='utf-8')
except FileNotFoundError:
    print(f"Sorry, the file {path} does not exist.")
else:       
    #计算文件大致包含多少个单词
    words = contents.split()
    num_words = len(words)       
    print(f"The file {path} has about {num_words} words.")