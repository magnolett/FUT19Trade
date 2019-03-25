package br.com.magtools.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode
@Table(name = "tb_player")
public class Player {

	@Id
	@Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "PLAYER_NAME")
	@NotNull
	private String playerName;
	
	@Column(name = "PRICE")
	@OneToOne(mappedBy = "player", fetch = FetchType.LAZY)
	private Price price;
	
	@Column(name = "PLAYER_VALUE_NOW")
	@NotNull
	private Double playerValue;

	@Column(name = "BEST_TIME_TO_BUY")
	@NotNull
	private boolean isTimeToBuy;

	
}
