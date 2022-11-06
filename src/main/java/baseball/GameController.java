package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GameController {

    NumberVO numberVO = new NumberVO();

    public List<Integer> inputUserNumber() {

        String userNumber = Console.readLine(); // 입력 받기
        List<Integer> userNumberList = userNumberConvertToList(userNumber); // 자릿수로 나눈 리스트로 변환
        System.out.println(userNumberList);
        return userNumberList;
    }

    // 숫자 하나씩 나누어서 리스트에 보관
    public List<Integer> userNumberConvertToList(String userNumber) {
        List<Integer> userNumberList = Stream.of(userNumber.split("")).mapToInt(Integer::parseInt)
                .boxed().collect(Collectors.toList());
        return userNumberList;
    }

    // userNumberList와 randomNumberList의 교집합 검사
    public List<Integer> checkIntersection(List<Integer> userNumberList, List<Integer> randomNumberList) {
        return randomNumberList.stream().filter(userNumberList::contains).collect(Collectors.toList());
    }

    public void checkGameResult(List<Integer> intersectionList, List<Integer> randomNumberList) {

        ShowMessage showMessage = new ShowMessage();
        int answerCount = showMessage.getAnswerCount();

        if (intersectionList.isEmpty()) { // 교집합 부분이 없다면
            ShowMessage.showNotMatchWord();
        } else if (intersectionList.size() == answerCount) { // 정답
            ShowMessage.showGameSet();
        } else {
            calculateGameCount(intersectionList, randomNumberList);
        }
    }

    public void calculateGameCount(List<Integer> intersectionList, List<Integer> randomNumberList) {

        ShowMessage showMessage = new ShowMessage();
        int answerCount = showMessage.getAnswerCount();
        int ballCount = 0;
        int strikeCount = 0;

        for (int i = 0; i < answerCount; i++) {
            System.out.println("스트라이크 몇 개인지 검사");
            if (intersectionList == randomNumberList) {
                System.out.println("스트라이크 발견");
                strikeCount++;
            }
        }
        ballCount = intersectionList.size() - strikeCount;
        System.out.println("볼:" + ballCount + ":");
        System.out.println("스트라이크:" + strikeCount + ":");
    }



}
