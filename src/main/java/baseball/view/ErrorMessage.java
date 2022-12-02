package baseball.view;

public enum ErrorMessage {
    CREATE_NUMBER_DUPLICATE("[ERROR] 생성된 값에 중복된 숫자가 있습니다."),
    CREATE_NUMBER_RANGE("[ERROR] 생성된 값의 숫자 범위에 오류가 발생했습니다."),
    INPUT_DUPLICATE("[ERROR] 중복된 값을 입력했습니다."),
    INPUT_RANGE("[ERROR] 올바른 숫자 범위가 아닙니다."),
    INPUT_LENGTH("[ERROR] 3자리의 수를 입력해야합니다."),
    INPUT_RESTART_LENGTH("[ERROR] 1 또는 2, 하나의 수만 입력가능합니다."),
    INPUT_ONE_OR_TWO("[ERROR] 잘못된 값을 입력했습니다."),
    INPUT_TYPE("[ERROR] 문자를 입력할 수 없습니다."),
    INPUT_BLANK("[ERROR] 공백이 있습니다.");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
