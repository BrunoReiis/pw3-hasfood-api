package br.com.bruno.reis.hasfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_ITEM_CARDAPIO")
public class ItemCardapio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ITEM_CARDAPIO")
	private long idITemCardapio;

	@Column(name = "TX_NOME")
	private String nome;
	
	@Column(name = "TX_DESCRICAO")
	private String descricao;
	
	@Column(name = "VLR_ITEM")
	private float valorItem;
	
	@Column(name = "TX_STATUS")
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "ID_CATEGORIA_CARDAPIO")
	private CategoriaCardapio idCategoriaCardapio;
}
