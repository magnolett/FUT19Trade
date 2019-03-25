package br.com.magtools.dao.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_price")
public class Price {

	@Id
	@Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "QUERY_TIME")
	private Date queryTime;
	
	@Column(name = "LOWEST_PRICE_HISTORY")
	@OneToMany(mappedBy = "price", fetch = FetchType.LAZY)
	private LowestPriceHistory lowestPriceHistory;

	@Column(name = "TODAYS_LOWEST_PRICE")
	private Double todaysLowestPrice;
	
	@Column(name = "TODAYS_HIGHEST_PRICE")
	private Double todaysHighestPrice;
	
	@Column(name = "TODAYS_AVERAGE_PRICE")
	private Double todaysAveragePrice;
	
}
