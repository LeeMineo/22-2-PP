# Project2. Simple CRUD service with AppDev

## [2단계] 최종보고서- Simple CRUD service 제작

### 1.수행내용
- Courses> Beginner > 2-1. Course Registration course 이수
  - Lesson 1 ~ 7

- HGUworkspace 내자신의 project 제작확인
  - project 이름 : 분반_학번_영문이름 (예 : 1분반 22100123학번의홍길동학생은1_22100123_GildongHong이라는프로젝트명사용)
  - Authority 탭에서 Group 검색하여HGU_Teachers그룹에게Manage/Admin권한부여하기
- Simple CRUD service (Word) 제작
  - Bizflow Edu PortalVideo tutorial >Data Table내의영상시청 & 제작
    - Basic Concepts >Basic Concept(06:10)
    - Basic Concepts >Data Table(27:30)
    - Basic Concepts >Action Column and Context Menu(07:10)
    - Basic Concepts >Search and Inline Edit Mode(08:44)

```
1. 데이터모델정의 → 2. Form / Block 제작 → 3. Table Container 세팅 →
4. Modal Detail Container 세팅  → 5. Action Column 세팅 →6. Search 기능세팅→ 
7. Context-menu 세팅 (선택) → 8. Inline edit 세팅 (선택)
```

-------
### 2.최종보고서체크리스트 (아래내용기준으로2 page PDF 보고서로제출할것!)
- 자신의 Project명은무엇인가?
> 3_22100503_MinSeoLee 

- 2-1. Course Registration course를충분히이수하였나?
> 네!
<img width="268" alt="스크린샷 2022-09-30 오후 4 29 47" src="https://user-images.githubusercontent.com/103713510/193561518-1337a052-1151-4b23-a2bf-35431bf4838f.png">


- 어떤 CRUD 서비스를제작하였는가?1) Video Tutorial의 Member 예제  2) 수업자료의영어단어장  3) 기타데이터
> 기타데이터 (커피주문)

- Lookup을새로생성하는방법, Data Entity에적용하는방법을알게되었는가?
> LookupManager 에서 원하는 타입의 데이터를 생성한 후에 데이터 엔티티 생성시 타입을 룩업을 선택해서 방금 만든 데이터를 선택해주면 된다.
<img width="577" alt="스크린샷 2022-10-01 오후 8 31 20" src="https://user-images.githubusercontent.com/103713510/193407479-2b5940e0-2174-45c9-9b12-dc4731281308.png">



- [1. 데이터모델정의]새로만든 Data Group, Data Entity의내용은무엇인가?
> Coffee 와 Name, Menu, Size, Price 이다.
<img width="766" alt="스크린샷 2022-10-01 오후 8 32 55" src="https://user-images.githubusercontent.com/103713510/193407530-fad7b5fe-ae46-4322-b153-57c2bb5dd6bd.png">


- [2. Form / Block 제작]새로만든 Grid Block, Grid Form의이름은무엇인가?
> Cafe_Form , Cafe_Block


- [3. Table Container 세팅]설명을기준으로 Add/Update/Delete/Reload 버튼을추가하고, 각버튼관련설정을마쳤는가?
> 네!


- [4. Modal Detail Component 세팅]설명을기준으로 Add / Update 버튼을클릭했을때 Modal 창의 Label과버튼이제대로구별되어표시되는가?
> 네!


- [5. Action Column 세팅]설명을기준으로 Update 버튼과 Delete 버튼이잘작동하는가?
> 네!


- [6. Search 기능세팅]설명을기준으로 Search, Reset 기능이잘작동하는가?
> 네!

- 선택기능(7,8) 중시도한것이있으면내용과결과를적어보라 (extra point 부여함)
> Context Menu 기능 생성
<img width="196" alt="스크린샷 2022-10-03 오후 7 43 03" src="https://user-images.githubusercontent.com/103713510/193558819-ca4830a9-e2e3-493b-893c-d3deb931461b.png">
<img width="366" alt="스크린샷 2022-10-03 오후 7 42 59" src="https://user-images.githubusercontent.com/103713510/193558829-be7adcc4-ae2b-4655-bc76-c22764f480e0.png">

> Inline Edit Mode 기능 생성
<img width="1191" alt="스크린샷 2022-10-03 오후 7 55 36" src="https://user-images.githubusercontent.com/103713510/193560930-95bc16eb-b835-4e62-993b-0c7c95a5e8d8.png">


- 완성된서비스에추가한데이터는모두몇개인가? (최소 10개이상이어야함)
> 13개

<img width="1512" alt="스크린샷 2022-10-03 오후 8 18 29" src="https://user-images.githubusercontent.com/103713510/193564702-0ac1ffc6-2177-44e1-976d-a4f6ce5637ed.png">
<img width="1512" alt="스크린샷 2022-10-03 오후 8 18 36" src="https://user-images.githubusercontent.com/103713510/193564710-5649fc7f-ab1b-49f4-a214-c3b1216883cb.png">


- 자신이완성한페이지를 AppDev Preview 화면 5종류를캡쳐하여붙일것.1) 리스트 2) Add Modal 3) Update Modal 4) Delete 결과 5) Search 결과
> 1) 리스트
<img width="1512" alt="스크린샷 2022-10-03 오후 8 18 29" src="https://user-images.githubusercontent.com/103713510/193564661-8db9e6ba-62a7-4c95-8340-0b8ffedf4545.png">

<img width="1512" alt="스크린샷 2022-10-03 오후 8 18 36" src="https://user-images.githubusercontent.com/103713510/193564670-9adeb3a9-6906-4fca-af0c-1af3cd602b3a.png">

> 2) Add modal
<img width="625" alt="스크린샷 2022-10-03 오후 8 21 07" src="https://user-images.githubusercontent.com/103713510/193565073-2a73ee78-3602-4c41-ab0e-17a3c6f5889f.png">
<img width="1209" alt="스크린샷 2022-10-03 오후 8 21 17" src="https://user-images.githubusercontent.com/103713510/193565077-23c1b1e9-52e6-4c97-9259-d7a115416154.png">


> 3) Update Modal
<img width="625" alt="스크린샷 2022-10-03 오후 8 22 15" src="https://user-images.githubusercontent.com/103713510/193565218-4297b9da-dd1c-48a9-9135-069883b211e0.png">
<img width="1207" alt="스크린샷 2022-10-03 오후 8 22 24" src="https://user-images.githubusercontent.com/103713510/193565223-867d724d-1ac4-41d2-9944-de6b090db582.png">


> 4) Delete 결과
<img width="1219" alt="스크린샷 2022-10-03 오후 8 22 45" src="https://user-images.githubusercontent.com/103713510/193565307-50689979-e606-40ea-99be-3d6b0660ea31.png">
<img width="1233" alt="스크린샷 2022-10-03 오후 8 23 00" src="https://user-images.githubusercontent.com/103713510/193565312-fc1143b2-e201-4f0e-91d0-05664660c676.png">


> 5) Search 결과 (m 으로 검색)
<img width="1218" alt="스크린샷 2022-10-03 오후 8 23 28" src="https://user-images.githubusercontent.com/103713510/193565403-9f4dddae-c61d-415c-af3d-ece3e92b51a1.png">





- 이번프로젝트의난이도를평가한다면?  (1:매우쉬움 ~ 10:매우어려움사이의숫자)
> 2 (처음에 프로젝트를 따라갈때 시간은 좀 걸리지만 영상을 반복해서 2번만 따라해도 영상설명없이 기능들을 구현할수 있게되어서 난이도는 낮은편이라고 생각한다.)

- 이번프로젝트를구현하면서느낀생각이나어려웠던사항, 또는건의사항을 50자이상적으라
> AppDev은 조작방법만 알면 쉽게 웹사이트를 만들수 있는 툴이라는것을 느꼈다. 또한 CSS 나 Html 자바스크립트의 문법들만 알면 더욱 쉽고 퀄리티가 높은 웹사이트를 만들수 있을것이라는 생각이 들었다. 궁금한 점은 여기서 만든 웹사이트를 실제로 사용할수있는가? 이다. 사용할 수 있다면 어떤식으로 사용할수있는지 궁금하다. 나중에 기회가 된다면 AppDev으로 실제 사이트를 만들어보고싶다.
