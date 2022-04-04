
import pyautogui
import time

word=open("word.txt","r")
time.sleep(0)

for words in word:
    pyautogui.typewrite(words)
    pyautogui.press("enter")
    time.sleep(0)



