# Nested Class
클래스 안에 정의된 클래스  
static nested class와 Non-static nested class가 있다  
<br>

* Static Nested Class
* Non Static Nested Class (이너 클래스, Inner class)
    - 멤버 클래스
    - 로컬 클래스
    - 익명 클래스



<hr>
<br>


> ## Static Nested Class
외부 클래스의 인스턴스 없이 네스티드 클래스의 인스턴스 생성 가능하다.  
외부 클래스의 인스턴스의 변수, 메소드에 접근 불가능하다 (존재하지 않을수 있으니까)

<br>


> ## Non static Nested Class
외부 인스턴스를 통해 인스턴스 생성 가능하다.  
외부 인스턴스에 종속적이다.  
외부 인스턴스의 변수, 메소드에 접근 가능하다

### 멤버 클래스
클래스의 정의를 숨길수있다(?) //아직 잘 모르겠다.

### 로컬 클래스
외부 클래스에서 메소드와 같은 블록안에서 정의되는 클래스

### 익명 클래스
클래스의 인스턴스를 생성과 동시에 해당 클래스를 정의하는 클래스  
(주로 인터페이스를 인스턴스 처럼 바로 만들어 쓸때 쓰이는것 같다)

--> 익명 클래스를 람다를 이용해 수정해서 코드를 줄일 수 있다.  
--> 람다와 익명클래스는 유사하지만 내부적인 동작 원리는 다르다.


```java
//익명 클래스
interface printable{
    void print(String s);
}

Printable prn = new Printable(){
    public void print(String s){
        System.out.println(s);
    }
}
```

```java
//람다 이용하여 수정
interface printable{
    void print(String s);
}

printable prn = (s)->System.out.println(s);
```






    


