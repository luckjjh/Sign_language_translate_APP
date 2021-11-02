# 수화번역을 위한 장갑과 앱
> 수화를 모르는 일반인과 청각장애인의 의사소통을 편리하게 만들기 위해 개발한 장갑과 앱</br>
> 수화를 하는 청각장애인이 장갑을 끼고 의사소통을 할 상대방이 앱의 카메라를 통해 수화하는 모습을 보는 방식으로 사용

수화는 손의 구부림 정도나 방향에 따라 의미가 크게 달라지기 때문에 손의 구부림은 장갑의 Flexible Sensor를 통해 측정하고</br>
측정된 값을 블루투스 모듈을 통해 앱과 통신함. 앱은 TensorFlow를 통해 학습한 수화 학습데이터와 센서값을 매칭해 수화를 </br>
텍스트로 출력함.

## 프로젝트 관련 보고서
> [KWIX](https://drive.google.com/file/d/19UZ8tf5LvbSVzNSAEUZcm2a1nlVTG9aS/view?usp=sharing)</br>
> [캡스톤설계1](https://drive.google.com/file/d/1docXOeC2uBonKRLFukO-CA2F8W-COD5S/view?usp=sharing)</br>

## 전체 Diagram
![ㅁㅁ](https://user-images.githubusercontent.com/68142773/120355221-12755480-c33e-11eb-98ae-c75e9c524a8b.png)

## 동작 영상
<img src=https://user-images.githubusercontent.com/68142773/139814531-982a53fe-a833-404d-9afd-1a6c1cb4f415.gif  width="300" height="600"/>

## 주요 코드
 -activity_blue.xml
> 수화번역 장갑과 블루투스 연결을 위한 activity layout

 -activity_cam.xml
> camera를 통한 영상처리를 하는 activity layout

-activity_main_login.xml
> 어플 실행시 제일 처음 나오는 main activity layout

-AndroidManifest.xml
> 어플 권한 관련 코드
> 블루투스 권한과 카메라 권한부여

-mainActivity.java
> main 화면, 버튼을 통한 화면 전환 코드
<img src=https://user-images.githubusercontent.com/68142773/139812977-30024cc8-1983-4e92-9449-2180f061dcf9.png  width="300" height="600"/>

-MyApp.java
> 전역변수를 위해 만든 class

-blueActivity.java
> bluetooth 통신 관련 코드 장갑 회로의 블루투스 모듈로부터 손가락의 구부림을 나타내는 센서값을 전달받아 저장 </br>

>> 장갑과 블루투스 연결 전</br>
<img src=https://user-images.githubusercontent.com/68142773/139813930-e0fd6e87-b094-4be7-b6dd-e755b520baa5.png  width="300" height="600"/></br>

>> 장갑과 블루투스 연결 완료</br>
<img src=https://user-images.githubusercontent.com/68142773/139814076-d57ee8b8-5625-4d78-af6f-0d7b882f4017.png  width="300" height="600"/></br>

-camActivity.java
> blueActivity.java의 센서값과 WebView를 통해 학습데이터 중 가장 큰 값을 나타내는 값을 매칭시켜 알맞은 수화를 텍스트로 출력
<img src=https://user-images.githubusercontent.com/68142773/139814401-ac52d88e-cd71-43f0-a918-14b0fffdd516.png  width="300" height="600"/>


## 사용 예제
[Hangul Parser](https://github.com/kimkevin/HangulParser)</br>
입력되는 자음, 모음을 합치는데 사용한 한글 병합 알고리즘
