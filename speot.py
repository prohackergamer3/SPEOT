import gtts
import os
kl = input("Kelime:")
try:
    ro = gtts.gTTS(kl,lang="tr")
    ro.save("output.mp3")
    os.system("java audioplay.java")
except:
    print("Hata!")