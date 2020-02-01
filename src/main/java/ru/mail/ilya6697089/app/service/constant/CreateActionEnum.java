package ru.mail.ilya6697089.app.service.constant;

public enum CreateActionEnum {

    CREATE_USER_TABLE("CREATE TABLE user\n" +
            "(\n" +
            "    id            INT(11) PRIMARY KEY AUTO_INCREMENT,\n" +
            "    username      VARCHAR(40) NOT NULL,\n" +
            "    password      VARCHAR(40) NOT NULL,\n" +
            "    age           INT         NOT NULL,\n" +
            "    is_active     BOOLEAN     NOT NULL DEFAULT TRUE\n" +
            ");"),
    CREATE_USER_INFORMATION_TABLE("CREATE TABLE user_information\n" +
            "(\n" +
            "    user_id   INT(11) PRIMARY KEY,\n" +
            "    address   VARCHAR(100) NOT NULL,\n" +
            "    telephone VARCHAR(40) NOT NULL,\n" +
            "    FOREIGN KEY (user_id) REFERENCES user (id)\n" +
            ");");

    private final String query;

    CreateActionEnum(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
