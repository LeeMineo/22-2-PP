# Project2. Simple CRUD service with AppDev

## [2단계] 최종보고서- Simple CRUD service 제작

### 1.수행내용
- Courses> Beginner > 2-1. Course Registration course 이수
  - Lesson 1 ~ 7
<img width="268" alt="스크린샷 2022-09-30 오후 4 29 47" src="https://user-images.githubusercontent.com/103713510/193215622-10310eac-a0ce-4bc2-bdc9-98969cd8a43f.png">


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
- 2-1. Course Registration course를충분히이수하였나?
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
- 선택기능(7,8) 중시도한것이있으면내용과결과를적어보라 (extra point 부여함)
- 완성된서비스에추가한데이터는모두몇개인가? (최소 10개이상이어야함)
- 자신이완성한페이지를 AppDev Preview 화면 5종류를캡쳐하여붙일것.1) 리스트 2) Add Modal 3) Update Modal 4) Delete 결과 5) Search 결과
- 이번프로젝트의난이도를평가한다면?  (1:매우쉬움 ~ 10:매우어려움사이의숫자)
- 이번프로젝트를구현하면서느낀생각이나어려웠던사항, 또는건의사항을 50자이상적으라
