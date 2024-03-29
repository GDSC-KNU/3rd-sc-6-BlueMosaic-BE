package com.gdsc.knu.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@SQLDelete(sql = "UPDATE ranking SET deleted = true WHERE id = ?")
@NoArgsConstructor
@Getter
public class Ranking extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private int score;

    private boolean deleted = Boolean.FALSE;

    public Ranking(User user, int score){
        this.user = user;
        this.score = score;
    }
}
