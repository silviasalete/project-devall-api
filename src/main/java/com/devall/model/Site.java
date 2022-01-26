package com.devall.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.devall.dto.SiteDto;
@Entity
public class Site {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer version;
	private Integer ativo;
//  Acesso negado
//	@OneToOne
//	private Autor autor;
	private String endereco;
	private String nome;
	private String rss;
	private String sobre;
	private Integer tentativas;
	private Date ultimaVerificacao;
	private Integer postsDia;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Integer getAtivo() {
		return ativo;
	}
	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRss() {
		return rss;
	}
	public void setRss(String rss) {
		this.rss = rss;
	}
	public String getSobre() {
		return sobre;
	}
	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
	public Integer getTentativas() {
		return tentativas;
	}
	public void setTentativas(Integer tentativas) {
		this.tentativas = tentativas;
	}

	public Date getUltimaVerificacao() {
		return ultimaVerificacao;
	}
	public void setUltimaVerificacao(Date ultimaVerificacao) {
		this.ultimaVerificacao = ultimaVerificacao;
	}
	public Integer getPostsDia() {
		return postsDia;
	}
	public void setPostsDia(Integer postsDia) {
		this.postsDia = postsDia;
	}
	/* Aguardando liberação
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}*/
	public SiteDto toDto() {
 
		SiteDto siteDto = new SiteDto(this.getId(),this.getNome(),this.getAtivo(), this.getSobre());
		return siteDto;
	}
	
	@Override
	public String toString() {
		return "Site [id=" + id + ", version=" + version + ", ativo=" + ativo + ", endereco=" + endereco + ", nome="
				+ nome + ", rss=" + rss + ", sobre=" + sobre + ", tentativas=" + tentativas + ", ultimaVerificacao="
				+ ultimaVerificacao + ", postsDia=" + postsDia + "]";
	}
	
}

