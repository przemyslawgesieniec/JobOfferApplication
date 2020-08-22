package pl.sda.JobOfferApplication.user.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Getter
@ToString
public class UserInput {

    private String name;
    private String login;
    private LocalDate creationDate;
    private String password;

    private UserInput() {
        creationDate = LocalDate.now();
    }
}
