package com.mycom.word;

public interface ICRUD { //인터페이스는 국룰로 I를 붙임
    public Object  add(); // 데이터 추가할때 사용하는 함수
    // 추가된 객체를 리턴해주기 위해 오브젝트를 사용
    public int update(Object obj); // 데이터 수정할때 사용하는 함수
    public int delete(Object obj);// 데이터 삭제할때 사용하는 함수
    public void selectOne(int id);// 데이터 한개를 조회할때 사용하는 함수
    //여기에 들어가는 리턴타입이나 파라미터는 작성하는 사람이 원하는 템플릿을 구성하는것에 맞추어서 작성하면 된다.
}