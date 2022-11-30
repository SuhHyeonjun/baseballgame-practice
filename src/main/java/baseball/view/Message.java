package baseball.view;

public enum Message {
    START_GAME("숫자 야구 게임을 시작합니다."),
    INPUT_NUMBER("숫자를 입력해주세요 : "),
    SUCCESS_GAME("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    ASK_RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    ENDGAME("게임을 종료 합니다."),
    STRIKE("스트라이크"),
    BALL("볼 "),
    NOTHING("낫싱");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
