package pl.sda.JobOfferApplication.user.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Getter
@ToString
public class UserInput {

    private String uuid;
    private String name;
    private String login;
    private String creationDate;
    private String password;

    private UserInput() {
        uuid = UUID.randomUUID().toString();
        creationDate = "now";
    }
}
