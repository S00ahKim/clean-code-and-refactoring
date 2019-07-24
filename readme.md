# 개발환경
JDK 1.8이상


# GildedRose

- 업무: 판매 가능 기간에 따른 품질 관리

- 기본 조건 
1. 모든 아이템에는 판매가능기간 (sellIn)이 있다. 
판매가능 기간은 아이템을 팔아야 하는 날까지 남아 있는 일 수로 표시한다.  

2. 모든 아이템에는 품질값(quality)이 있다. 
품질값은 아이템이 얼마나 가치있는지를 나타낸다.  

3. 우리 시스템은 매일 자정에 모든 아이템의 값들을 갱신한다.  

- 추가 조건  
1. 판매가능 기간이 지나면, 품질은 두배씩 빨리 떨어진다.  

2. 아이템의 품질은 음수가 될 수 없다.  

3. 아이템의 품질은 50보다 클 수 없다.    

4. "Aged Brie"는 시간이 지날수록 품질이 증가한다.  

5. "Sulfuras"는 전설의 아이템으로 팔지도 않고 품질이 떨어지지도 않는다.  

6. "Backstage passes" 는 판매가능기간이 다가올수록 품질이 증가한다.   
판매가능기간이 10일 이하일 때 품질은 2씩 증가하고, 판매가능기간이 5일 이하일때는 3씩 증가한다.   
콘서트가 끝나고 판매가능 기간이 지나면 품질은 0이 된다.  
