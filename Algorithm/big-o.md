# Big O notation
## 알고리즘의 스피드 표현법

같은 알고리즘이라도 컴퓨터에따라 스피드가 다르다.  
따라서 알고리즘 스피드는 완료까지 걸리는 절차의 수로 결정된다.

input size 가 중요하다

선형검색 알고리즘은 input이 n 일때 n번 실행을한다.

Time Complexity  
선형검색의 시간 복잡도 O(n)  
상수는 신경쓰지 않는다

linear time algorithm : O(n)  

constant time algorithm : O(1)  
O(2n)이어도 상수시간은 다 O(1)라고 한다.

Quadratic Time algorithm : O(n^2)  

Logarithmic time algorithm : O(log n)  
<hr>


<br>
<br>

# 시간 복잡도의 표기

### 시간 복잡도는, 입력 크기의 함수적 관계식으로 표현되며,  
### 이때 함수의 증가율을 특징지울 수 있는, 여러 부류들이 다음과 같음

* O(c) 또는 O(1)  :  상수 시간 알고리즘 (constant time algorithm)
  * 입력 크기(개수)에 관계없이 수행 속도(계산 횟수) 일정
  * 가장 효율적임을 뜻함
  * 例) 배열에 있는 항목을 인덱스를 사용하여 접근할 때, 집합 내 요소로의 접근 등

<br>

* O(log n)  :  로그 시간 알고리즘 (logarithmic time algorithm)
  * 로그 함수 형태 알고리즘 (밑이 2인 로그함수 : log2 )
        . 통상, 데이터가 2배로 증가할 때, 연산수가 1 단계 씩 늘어나는 형태
  * 입력 개수가 증가하면서 포물선 곡선이 한쪽으로 수렴하므로, 
        . 데이터가 많아질수록 우수 수행 성능
  * 例) 이진 검색

<br>

* O(n)  :  선형 시간(1차 시간) 알고리즘 (linear time algorithm)
  * 선형 함수 형태 알고리즘
        . 입력 개수에 단순 비례적으로 수행 시간이 길어짐
  * 최악의 경우에 입력 개수 만큼 연산을 수행해야 함
  * 例) 중첩되지 않은 통상의 반복문, 선형 검색, 자연수의 거듭제곱 등

<br>

* O(n log n)  :  n 로그 시간 알고리즘 (nlogn time algorithm)
  * 例) 반복문 증가 스텝이 2의 배수로 하여 2,4,8,16,32,64 처럼 증가하는 경우 등

<br>

* O(n2) :  평방 시간(2차 시간) 알고리즘 (quadratic time algorithm)
  * 문제 해결 단계의 수가 입력값 n의 제곱으로 증가
        . n이 적을 경우에 만 사용해야 하는 느리고 비효율적인 알고리즘
  * 例) 2번 중첩된 반복문(for 문), 버블정렬,삽입정렬,선택정렬 등

<br>

* O(n3) : 3차 시간 알고리즘
  * 例) 3번 중첩된 반복문(for 문) 등

<br>

* O(nk) :  다항 시간 알고리즘 (polynomial time algorithm)
  * 입력 크기에 대한 다항식으로 나타나는 알고리즘
        . 다항식 : 입력 n과, nk(n의 상수 거듭제곱)들의 선형 결합으로 이루어진 식
        . 즉, O(n),O(n2),O(n3),... 등 O(nk) 모두를 가리킴
  * 주로, 중첩된 반복문의 수행 횟수를, 입력 크기의 다항식으로 표현할 수 있는 알고리즘들

<br>

* O(2n) 또는 O(rn) :  지수 시간 알고리즘 (exponential time algorithm)
  * n이 하나 증가할 때 마다, 걸리는 시간이 그전보다 2배 또는 r배로 걸리는 매우 나쁜 사례 

<br>

* O(n!)  :  계승 시간 (factorial time algorithm)
  * 지수 시간 보다 더 많이 걸림 (더 빠르게 증가함)
  * 따라서, 초 지수 시간(super-exponential)이라고도 함
 
<br>

* O(∞) :  종료되지 않는 무한 루프


* 시간복잡도 연산 크기 순서
     * O(1) < O(log n) < O(n) < O(nlogn) < O(n2) < O(n3) < O(2n) < O(n!) < O(∞)  
<br>
<br>

<hr> 


출처 [http://www.ktword.co.kr/test/view/view.php?m_temp1=6146](http://www.ktword.co.kr/test/view/view.php?m_temp1=6146) 

