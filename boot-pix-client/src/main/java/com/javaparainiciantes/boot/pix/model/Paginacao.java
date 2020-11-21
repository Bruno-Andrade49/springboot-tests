/*
 * API Pix
 * A API Pix padroniza serviços oferecidos pelo PSP recebedor no contexto do arranjo Pix, como criação de cobrança, verificação de Pix recebidos, devolução e conciliação. Os serviços expostos pelo PSP recebedor permitem ao usuário recebedor estabelecer integração de sua automação com os serviços PIX do PSP.  # Evolução da API Pix As seguintes mudanças são esperadas e consideradas retro-compatíveis (_backwards-compatibility_):  - Adição de novos recursos na API Pix. - Adição de novos parâmetros opcionais a cobranças. - Adição de novos campos em respostas da API Pix. - Alteração da ordem de campos. - Adição de novos elementos em enumerações  Mudanças compatíveis não geram nova versão da API Pix. Clientes devem estar preparados para lidar com essas mudanças sem quebrar.  Mudanças incompatíveis geram nova versão da API Pix.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: suporte.ti@bcb.gov.br
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.javaparainiciantes.boot.pix.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Paginacao
 */
@JsonPropertyOrder({
  Paginacao.JSON_PROPERTY_PAGINA_ATUAL,
  Paginacao.JSON_PROPERTY_ITENS_POR_PAGINA,
  Paginacao.JSON_PROPERTY_QUANTIDADE_DE_PAGINAS,
  Paginacao.JSON_PROPERTY_QUANTIDADE_TOTAL_DE_ITENS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-06T23:21:02.042427800-03:00[America/Sao_Paulo]")
public class Paginacao {
  public static final String JSON_PROPERTY_PAGINA_ATUAL = "paginaAtual";
  private Integer paginaAtual;

  public static final String JSON_PROPERTY_ITENS_POR_PAGINA = "itensPorPagina";
  private Integer itensPorPagina;

  public static final String JSON_PROPERTY_QUANTIDADE_DE_PAGINAS = "quantidadeDePaginas";
  private Integer quantidadeDePaginas;

  public static final String JSON_PROPERTY_QUANTIDADE_TOTAL_DE_ITENS = "quantidadeTotalDeItens";
  private Integer quantidadeTotalDeItens;


  public Paginacao paginaAtual(Integer paginaAtual) {
    
    this.paginaAtual = paginaAtual;
    return this;
  }

   /**
   * Número da página recuperada.
   * minimum: 0
   * @return paginaAtual
  **/
  @ApiModelProperty(required = true, value = "Número da página recuperada.")
  @JsonProperty(JSON_PROPERTY_PAGINA_ATUAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPaginaAtual() {
    return paginaAtual;
  }


  public void setPaginaAtual(Integer paginaAtual) {
    this.paginaAtual = paginaAtual;
  }


  public Paginacao itensPorPagina(Integer itensPorPagina) {
    
    this.itensPorPagina = itensPorPagina;
    return this;
  }

   /**
   * Quantidade de registros retornado na página.
   * minimum: 1
   * @return itensPorPagina
  **/
  @ApiModelProperty(required = true, value = "Quantidade de registros retornado na página.")
  @JsonProperty(JSON_PROPERTY_ITENS_POR_PAGINA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getItensPorPagina() {
    return itensPorPagina;
  }


  public void setItensPorPagina(Integer itensPorPagina) {
    this.itensPorPagina = itensPorPagina;
  }


  public Paginacao quantidadeDePaginas(Integer quantidadeDePaginas) {
    
    this.quantidadeDePaginas = quantidadeDePaginas;
    return this;
  }

   /**
   * Quantidade de páginas disponíveis para consulta.
   * minimum: 1
   * @return quantidadeDePaginas
  **/
  @ApiModelProperty(required = true, value = "Quantidade de páginas disponíveis para consulta.")
  @JsonProperty(JSON_PROPERTY_QUANTIDADE_DE_PAGINAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getQuantidadeDePaginas() {
    return quantidadeDePaginas;
  }


  public void setQuantidadeDePaginas(Integer quantidadeDePaginas) {
    this.quantidadeDePaginas = quantidadeDePaginas;
  }


  public Paginacao quantidadeTotalDeItens(Integer quantidadeTotalDeItens) {
    
    this.quantidadeTotalDeItens = quantidadeTotalDeItens;
    return this;
  }

   /**
   * Quantidade total de itens disponíveis de acordo com os parâmetros informados.
   * minimum: 0
   * @return quantidadeTotalDeItens
  **/
  @ApiModelProperty(required = true, value = "Quantidade total de itens disponíveis de acordo com os parâmetros informados.")
  @JsonProperty(JSON_PROPERTY_QUANTIDADE_TOTAL_DE_ITENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getQuantidadeTotalDeItens() {
    return quantidadeTotalDeItens;
  }


  public void setQuantidadeTotalDeItens(Integer quantidadeTotalDeItens) {
    this.quantidadeTotalDeItens = quantidadeTotalDeItens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paginacao paginacao = (Paginacao) o;
    return Objects.equals(this.paginaAtual, paginacao.paginaAtual) &&
        Objects.equals(this.itensPorPagina, paginacao.itensPorPagina) &&
        Objects.equals(this.quantidadeDePaginas, paginacao.quantidadeDePaginas) &&
        Objects.equals(this.quantidadeTotalDeItens, paginacao.quantidadeTotalDeItens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paginaAtual, itensPorPagina, quantidadeDePaginas, quantidadeTotalDeItens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paginacao {\n");
    sb.append("    paginaAtual: ").append(toIndentedString(paginaAtual)).append("\n");
    sb.append("    itensPorPagina: ").append(toIndentedString(itensPorPagina)).append("\n");
    sb.append("    quantidadeDePaginas: ").append(toIndentedString(quantidadeDePaginas)).append("\n");
    sb.append("    quantidadeTotalDeItens: ").append(toIndentedString(quantidadeTotalDeItens)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

