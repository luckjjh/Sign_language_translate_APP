# ๐์ํ๋ฒ์ญ์ ์ํ ์ฅ๊ฐ๊ณผ ์ฑ๐
> ์ํ๋ฅผ ๋ชจ๋ฅด๋ ์ผ๋ฐ์ธ๊ณผ ์ฒญ๊ฐ์ฅ์ ์ธ์ ์์ฌ์ํต์ ํธ๋ฆฌํ๊ฒ ๋ง๋ค๊ธฐ ์ํด ๊ฐ๋ฐํ ์ฅ๊ฐ๊ณผ ์ฑ</br>
> ์ํ๋ฅผ ํ๋ ์ฒญ๊ฐ์ฅ์ ์ธ์ด ์ฅ๊ฐ์ ๋ผ๊ณ  ์์ฌ์ํต์ ํ  ์๋๋ฐฉ์ด ์ฑ์ ์นด๋ฉ๋ผ๋ฅผ ํตํด ์ํํ๋ ๋ชจ์ต์ ๋ณด๋ ๋ฐฉ์์ผ๋ก ์ฌ์ฉ

์ํ๋ ์์ ๊ตฌ๋ถ๋ฆผ ์ ๋๋ ๋ฐฉํฅ์ ๋ฐ๋ผ ์๋ฏธ๊ฐ ํฌ๊ฒ ๋ฌ๋ผ์ง๊ธฐ ๋๋ฌธ์ ์์ ๊ตฌ๋ถ๋ฆผ์ ์ฅ๊ฐ์ Flexible Sensor๋ฅผ ํตํด ์ธก์ ํ๊ณ </br>
์ธก์ ๋ ๊ฐ์ ๋ธ๋ฃจํฌ์ค ๋ชจ๋์ ํตํด ์ฑ๊ณผ ํต์ ํจ. ์ฑ์ TensorFlow๋ฅผ ํตํด ํ์ตํ ์ํ ํ์ต๋ฐ์ดํฐ์ ์ผ์๊ฐ์ ๋งค์นญํด ์ํ๋ฅผ </br>
ํ์คํธ๋ก ์ถ๋ ฅํจ.

## ํ๋ก์ ํธ ๊ด๋ จ ๋ณด๊ณ ์
* [KWIX](https://drive.google.com/file/d/19UZ8tf5LvbSVzNSAEUZcm2a1nlVTG9aS/view?usp=sharing)</br>
* [์บก์คํค์ค๊ณ1](https://drive.google.com/file/d/1docXOeC2uBonKRLFukO-CA2F8W-COD5S/view?usp=sharing)</br>

## ์ ์ฒด Diagram
![ใใ](https://user-images.githubusercontent.com/68142773/120355221-12755480-c33e-11eb-98ae-c75e9c524a8b.png)

## ๐๋์ ์์๐
<img src=https://user-images.githubusercontent.com/68142773/139814531-982a53fe-a833-404d-9afd-1a6c1cb4f415.gif  width="300" height="600"/>

## ํ์ตํ ์ํ
<img src=https://user-images.githubusercontent.com/68142773/139819868-fdf7e581-5bc6-43a0-a740-ae16043a51c7.png  width="600" height="600"/>

## ์ฃผ์ Activity
 -activity_blue.xml
> ์ํ๋ฒ์ญ ์ฅ๊ฐ๊ณผ ๋ธ๋ฃจํฌ์ค ์ฐ๊ฒฐ์ ์ํ activity layout

 -activity_cam.xml
> camera๋ฅผ ํตํ ์์์ฒ๋ฆฌ๋ฅผ ํ๋ activity layout

-activity_main_login.xml
> ์ดํ ์คํ์ ์ ์ผ ์ฒ์ ๋์ค๋ main activity layout

-AndroidManifest.xml
> ์ดํ ๊ถํ ๊ด๋ จ ์ฝ๋
> ๋ธ๋ฃจํฌ์ค ๊ถํ๊ณผ ์นด๋ฉ๋ผ ๊ถํ๋ถ์ฌ

-mainActivity.java
> main ํ๋ฉด, ๋ฒํผ์ ํตํ ํ๋ฉด ์ ํ ์ฝ๋
<img src=https://user-images.githubusercontent.com/68142773/139812977-30024cc8-1983-4e92-9449-2180f061dcf9.png  width="300" height="600"/>

-MyApp.java
> ์ ์ญ๋ณ์๋ฅผ ์ํด ๋ง๋  class

-blueActivity.java
> bluetooth ํต์  ๊ด๋ จ ์ฝ๋ ์ฅ๊ฐ ํ๋ก์ ๋ธ๋ฃจํฌ์ค ๋ชจ๋๋ก๋ถํฐ ์๊ฐ๋ฝ์ ๊ตฌ๋ถ๋ฆผ์ ๋ํ๋ด๋ ์ผ์๊ฐ์ ์ ๋ฌ๋ฐ์ ์ ์ฅ </br>

>* ์ฅ๊ฐ๊ณผ ๋ธ๋ฃจํฌ์ค ์ฐ๊ฒฐ ์ </br>
<img src=https://user-images.githubusercontent.com/68142773/139906012-8cec3e25-c71d-4e5b-95a0-1c2e6bc1f359.png  width="300" height="600"/></br>

>* ์ฅ๊ฐ๊ณผ ๋ธ๋ฃจํฌ์ค ์ฐ๊ฒฐ ์๋ฃ</br>
<img src=https://user-images.githubusercontent.com/68142773/139814076-d57ee8b8-5625-4d78-af6f-0d7b882f4017.png  width="300" height="600"/></br>

-camActivity.java
> blueActivity.java์ ์ผ์๊ฐ๊ณผ [WebView](https://github.com/luckjjh/Sign_language_translate_Web)๋ฅผ ํตํด ํ์ต๋ฐ์ดํฐ ์ค ๊ฐ์ฅ ํฐ ๊ฐ์ ๋ํ๋ด๋ ๊ฐ์ ๋งค์นญ์์ผ ์๋ง์ ์ํ๋ฅผ ํ์คํธ๋ก ์ถ๋ ฅ
<img src=https://user-images.githubusercontent.com/68142773/139814401-ac52d88e-cd71-43f0-a918-14b0fffdd516.png  width="300" height="600"/>


## ๐ค์ฌ์ฉ ์์ 
[Hangul Parser](https://github.com/kimkevin/HangulParser)</br>
์๋ ฅ๋๋ ์์, ๋ชจ์์ ํฉ์น๋๋ฐ ์ฌ์ฉํ ํ๊ธ ๋ณํฉ ์๊ณ ๋ฆฌ์ฆ
