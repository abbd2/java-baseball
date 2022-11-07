1) 출력할 대본과 관련된 ShowMessage 클래스 생성
- 낫싱을 출력할 showNotMatchWord 메소드 생성
- 게임을 시작했을 때의 문구를 출력할 showGameStart 메소드 생성
- 숫자를 입력 받을 때의 문구를 출력할 showInputNumber 메소드 생성
- 볼, 스트라이크의 결과를 출력할 showGameScore메소드 생성
- 3개의 숫자를 모두 맞히고 게임이 종료됐을 때의 문구를 출력할 showEndGame메소드 생성
- 게임 재시작 여부를 묻는 showNewGameCheck 메소드 생성
- 숫자의 개수를 반환하는 getAnswerCount 메소드 생성
- showEndGame 메소드와 showNewGameCheck 메소드를 동시해 실행해 줄 showEndGameNewGameCheck 생성

2) 난수 생성과 관련된 RandomNumber 클래스 생성
- 1 ~ MAX_RANDOM_NUMBER까지의 난수를 생성하는 메소드 생성
- 생성된 난수를 List<Integer>로 반환하는 메소드 생성

3) 사용자 입력에 관련된 inputController 클래스 생성
- 사용자에게 받은 입력 값을 List<Integer> userNumberConvertToList메소드 생성
- 사용자의 입력을 받아올 getInput 메소드 생성

4)게임 진행을 컨트롤하는 GameController 클래스 생성
- 사용자가 입력한 값과 컴퓨터가 생성한 난수의 교집합을 구하는 checkIntersection 메소드 생성
- 게임을 시작하는 newGame 메소드 생성
- 사용자에게 입력받은 값을 List<Integer>로 변환하여 반환하는 inputConvertToList 메소드 생성
- 게임이 계속 진행되는지 체크하는 keepGame 메소드 생성
- 게임 결과를 반환하는 gameResult 메소드 생성
- 낫싱인지 체크하는 checkNotMatch 메소드 생성
- 볼과 스트라이크의 수를 계산하는 calculateGameCount 메소드 생성
- 게임 재시작 여부를 묻는 checkGame 메소드 생성

5) 예외 처리를 관리할 ExceptionController 클래스 생성
- userInput 값의 예외를 처리하는 inputNumberException 메소드 생성
- 새게임 여부를 묻는 입력의 예외를 처리하는 checkNewGameException 메소드 생성


