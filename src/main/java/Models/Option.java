package Models;

import javax.persistence.*;

@Entity
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int optionId;
    private String optionName;
//    @ManyToOne
//    private Poll poll;
}
