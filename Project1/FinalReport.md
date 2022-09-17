# Project1. Java CRUD project with file I/O
---------
## [2단계] 최종보고서- 수정/삭제, 검색, 파일저장및로딩기능구현

### 1. 프로젝트 수행 수준
1 개발항목 <br>
	1) ~~데이터 수정 및 삭제 기능~~ <br>
	2) ~~관리중인 데이터를 파일로 저장하는 기능~~ <br>
	- 데이터 파일 예 ( 파일명은 임의로 정할 것) <br>
	<img width="259" alt="savefilecontents" src="https://user-images.githubusercontent.com/103713510/190851217-207927a8-e078-4d97-8645-f92fc4539bf0.png"> <br>

2 ~~프로그램을 실행하면 이미 저장된 데이터 파일을 열어 데이터를 읽어온 후, 이 데이터를 기반으로 단어 관리를 수행. [7.파일저장]을 통해 업데이트.~~ <br>
3 ~~검색기능 구현 [2.수준별 단어보기 / 3.단어검색]~~ <br>
~~- 메뉴 및 기능을 추가 구현하면서 적절한 시점에 commit 진행 (누적 합계 총 10회 이상)~~ <br>
~~- 소스코드는 github의 repo에 push할것.~~ <br>
~~- 모든 실행결과는 screenshots 폴더에 업로드 하고, README.md에 img 태그로 반영~~ <br>

> 모두 구현 완료!

### 2.진행보고서 체크리스트

-	프로젝트를 공유한 github repo url 은 ?
> https://github.com/LeeMineo/22-2-PP.git <br>

-	Commit 수는 최소한 10회 이상인가? (1단계 진행보고서의 commit포함)
<img width="191" alt="스크린샷 2022-09-17 오후 6 56 10" src="https://user-images.githubusercontent.com/103713510/190851151-035cd9f7-5f8c-499d-9abc-461d1a2fc1ca.png">


-	[2.수준별 단어보기] 메뉴 선택시 실행 결과 예시와 동일하게 잘 표현되는가?
<img width="338" alt="level" src="https://user-images.githubusercontent.com/103713510/190850478-fe192cb3-7423-4bbc-ae1a-44e8f7b93e95.png">

-	위 실행 화면 캡쳐 이미지를 github에 올리고, README.md에 연결했는가?
> 네!

-	[3.단어 검색] 메뉴 선택시 실행 결과 예시와 동일하게 잘 표현되는가?
<img width="328" alt="wordsearch" src="https://user-images.githubusercontent.com/103713510/190850567-c1f61f51-d39d-41b9-a7ae-10143afa3a25.png">


-	위 실행 화면 캡쳐 이미지를 github에 올리고, README.md에 연결했는가?
> 네!

-	[5.단어 수정] 메뉴 선택시 실행 결과 예시와 동일하게 잘 표현되는가?
<img width="281" alt="wordupdate" src="https://user-images.githubusercontent.com/103713510/190850573-6afb1155-ab46-4e47-9a28-03a1b4adf3af.png">

<img width="247" alt="wordupdateresult" src="https://user-images.githubusercontent.com/103713510/190850574-01fbb7be-ce57-4efa-b423-9d24c609af02.png">

-	위 실행 화면 캡쳐 이미지를 github에 올리고, README.md에 연결했는가?
> 네!

-	[6.단어 삭제] 메뉴 선택시 실행 결과 예시와 동일하게 잘 표현되는가?
<img width="318" alt="beforedeleteword" src="https://user-images.githubusercontent.com/103713510/190850583-cf7a58e7-9a11-46d8-90e2-614985ef8ada.png">
<img width="324" alt="deleteword" src="https://user-images.githubusercontent.com/103713510/190850589-69632a07-78a7-4125-9054-2d0e181e14dc.png">
<img width="325" alt="afterdeleteword" src="https://user-images.githubusercontent.com/103713510/190850592-43f1f469-eaac-4a2a-8f0d-1c4d947c4a6a.png">


-	위 실행 화면 캡쳐 이미지를 github에 올리고, README.md에 연결했는가?
> 네!

-	[7.파일 저장] 메뉴 선택시 현재 관리중인 모든 단어가 일정한 포맷으로 파일에 저장되는가?
<img width="231" alt="savefile" src="https://user-images.githubusercontent.com/103713510/190850597-8e8b4b9d-59b3-47a4-affc-1c2759b0aaa4.png">
<img width="259" alt="savefilecontents" src="https://user-images.githubusercontent.com/103713510/190850600-8f21aa24-854f-44f7-810b-70081a0f7696.png">


-	저장된 데이터 파일의 위치(경로)와 파일 이름은 무엇인가?
<img width="263" alt="wheresavefile" src="https://user-images.githubusercontent.com/103713510/190850626-6c59b994-2da3-4af9-9b07-7da45788b854.png">


-	위 실행 화면 캡쳐 이미지를 github에 올리고, README.md에 연결했는가? (파일내용도 캡쳐)
> 네!

-	프로그램을 새로 실행하면 파일에 있는 모든단어를 가져오고, [1.모든 단어보기]를 실행했을 떄 모든 단어가 잘 출력되는가?
<img width="326" alt="filelode" src="https://user-images.githubusercontent.com/103713510/190850633-da1b7520-6278-4877-8410-1bb395c8ce5a.png">


-	위 실행 화면 캡쳐 이미지를 github에 올리고, README.md에 연결했는가?
> 네!

-	이번 프로젝트를 진행하면서 사용한 JAVA 클래스를 모두 작성하시오.


-	프로젝트 난이도는? (상, 중, 하)


-	현재까지 프로젝트를 구현하면서 소감, 어려움, 또는 건의사항을 무엇인가?



### 3. 결과 예시
