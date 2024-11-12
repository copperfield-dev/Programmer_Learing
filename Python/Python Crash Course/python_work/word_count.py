from pathlib import Path    
def count_words(path):
    """计算一个文件大致包含多少个单词"""     
    try:           
        contents = path.read_text(encoding='utf-8')       
    except FileNotFoundError:           
        print(f"Sorry, the file {path} does not exist.")       
    else:           
        # 计算文件大致包含多少个单词           
        words = contents.split()           
        num_words = len(words)           
        print(f"The file {path} has about {num_words} words.")    
        
filenames = ['alice.txt', 'siddhartha.txt', 'moby_dick.txt', 'little_women.txt']   
for filename in filenames: 
    path = Path('text_files/' + filename)
    count_words(path)