package com.mysite.sbb.answer;

import java.time.LocalDateTime;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.user.SiteUser;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.ManyToOne;
import java.util.Set;
import jakarta.persistence.ManyToMany;

@Getter
@Setter
@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	
	private LocalDateTime createDate;
	
    private LocalDateTime modifyDate;

   
	@ManyToOne
	private Question question;
	
	@ManyToOne
    private SiteUser author;
	
	@ManyToMany
	Set<SiteUser> voter;
}
