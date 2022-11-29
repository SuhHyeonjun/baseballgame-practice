## 숫자 야구 게임 연습
4번의 미션을 진행하면서 배운점과 피드백을 통해 고쳐할 부분들을 반영하여 숫자 야구 게임을 완성한다.
기존의 숫자 야구 게임 요구 사항의 "잘못된 값을 입력할 경우 종료한다" 에서,
잘못된 값을 입력할 경우 "ERROR"가 포함된 메시지를 출력하고, 그 부분 부터 다시 입력하도록한다.

### ✅ 랜덤한 3자리의 숫자를 생성한다.
- [x] 각 자리의 숫자가 서로 다른 3자리 수를 생성한다. 
- [x] 각 자리의 숫자는 1부터 9까지의 범위를 가진다.

##### 예외사항
- [x] 중복된 수가 생성될 시 IllegalStateException을 발생시킨다.
- [x] 각 자리의 숫자 범위가 1~9가 아닐 시 IllegalStateException을 발생시킨다.

---
### ✅ 플레이어가 3자리 수를 입력한다.
- [] 서로 다른 3자리 수를 입력한다.
- [] 1부터 9까지의 수를 입력할 수 있다.

##### 예외사항
- [] 중복되는 수를 입력할 시 IllegalArgumentException을 발생시킨다.
- [] 각 자리수가 1 ~ 9의 범위의 숫자가 아닐 시 IllegalArgumentException을 발생시킨다.
- [] 문자를 입력 시 NumberFormatException을 발생시킨다.
- [] 공백이 입력되면 IllegalArgumentException을 발생시킨다.

---
### ✅ 컴퓨터의 수와 입력한 수를 비교하여 힌트를 준다.
**컴퓨터의 숫자 : 123일 때 예시**
- [] 숫자의 자리수와 번호가 일치하면 그 개수 만큼 스트라이크를 출력한다.
  - 453을 입력 시 : 1스트라이크
- [] 숫자의 자리수는 틀리지만 일치하는 번호가 있다면 그 개수만큼 볼을 출력한다.
  - 341을 입력 시 : 2볼
- [] 일치하는 수가 없다면 "낫싱"을 출력한다.
  - 456을 입력 시 : 낫싱
