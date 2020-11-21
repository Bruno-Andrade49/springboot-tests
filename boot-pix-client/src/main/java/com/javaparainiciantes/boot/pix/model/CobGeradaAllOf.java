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

import java.net.URI;
import java.util.Objects;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModelProperty;

/**
 * CobGeradaAllOf
 */
@JsonPropertyOrder({
  CobGeradaAllOf.JSON_PROPERTY_CALENDARIO,
  CobGeradaAllOf.JSON_PROPERTY_STATUS,
  CobGeradaAllOf.JSON_PROPERTY_TXID,
  CobGeradaAllOf.JSON_PROPERTY_REVISAO,
  CobGeradaAllOf.JSON_PROPERTY_LOCATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-06T23:21:02.042427800-03:00[America/Sao_Paulo]")
public class CobGeradaAllOf {
  public static final String JSON_PROPERTY_CALENDARIO = "calendario";
  private CobCriacao calendario = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CobStatus status;

  public static final String JSON_PROPERTY_TXID = "txid";
  private String txid;

  public static final String JSON_PROPERTY_REVISAO = "revisao";
  private Integer revisao;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private URI location;


  public CobGeradaAllOf calendario(CobCriacao calendario) {
    
    this.calendario = calendario;
    return this;
  }

   /**
   * Os campos aninhados sob o identificador calendário organizam informações a respeito de controle de tempo da cobrança.
   * @return calendario
  **/
  @Nullable
  @ApiModelProperty(value = "Os campos aninhados sob o identificador calendário organizam informações a respeito de controle de tempo da cobrança.")
  @JsonProperty(JSON_PROPERTY_CALENDARIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CobCriacao getCalendario() {
    return calendario;
  }


  public void setCalendario(CobCriacao calendario) {
    this.calendario = calendario;
  }


  public CobGeradaAllOf status(CobStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CobStatus getStatus() {
    return status;
  }


  public void setStatus(CobStatus status) {
    this.status = status;
  }


  public CobGeradaAllOf txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * # Identificador da transação  O campo txid, obrigatório, determina o identificador da transação. O objetivo desse campo é ser um elemento que possibilite ao PSP do recebedor apresentar ao usuário recebedor a funcionalidade de conciliação de pagamentos.  Na pacs.008, é referenciado como &#x60;TransactionIdentification &lt;txId&gt;&#x60; ou &#x60;idConciliacaoRecebedor&#x60;. O preenchimento do campo txid é limitado a 35 caracteres na pacs.008.  Em termos de fluxo de funcionamento, o txid é lido pelo aplicativo do PSP do pagador e,  depois de confirmado o pagamento, é enviado para o SPI via pacs.008.  Uma pacs.008 também é enviada ao PSP do recebedor, contendo, além de todas as informações usuais  do pagamento, o txid. Ao perceber um recebimento dotado de txid, o PSP do recebedor está apto a se comunicar com o usuário recebedor,  informando que um pagamento específico foi liquidado.  O txid é criado exclusivamente pelo usuário recebedor e está sob sua responsabilidade. O txid, no contexto de representação de uma cobrança, é único por CPF/CNPJ do usuário recebedor. Cabe ao  PSP recebedor validar essa regra na API PIX. 
   * @return txid
  **/
  @Nullable
  @ApiModelProperty(value = "# Identificador da transação  O campo txid, obrigatório, determina o identificador da transação. O objetivo desse campo é ser um elemento que possibilite ao PSP do recebedor apresentar ao usuário recebedor a funcionalidade de conciliação de pagamentos.  Na pacs.008, é referenciado como `TransactionIdentification <txId>` ou `idConciliacaoRecebedor`. O preenchimento do campo txid é limitado a 35 caracteres na pacs.008.  Em termos de fluxo de funcionamento, o txid é lido pelo aplicativo do PSP do pagador e,  depois de confirmado o pagamento, é enviado para o SPI via pacs.008.  Uma pacs.008 também é enviada ao PSP do recebedor, contendo, além de todas as informações usuais  do pagamento, o txid. Ao perceber um recebimento dotado de txid, o PSP do recebedor está apto a se comunicar com o usuário recebedor,  informando que um pagamento específico foi liquidado.  O txid é criado exclusivamente pelo usuário recebedor e está sob sua responsabilidade. O txid, no contexto de representação de uma cobrança, é único por CPF/CNPJ do usuário recebedor. Cabe ao  PSP recebedor validar essa regra na API PIX. ")
  @JsonProperty(JSON_PROPERTY_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public CobGeradaAllOf revisao(Integer revisao) {
    
    this.revisao = revisao;
    return this;
  }

   /**
   * Revisão da cobrança. Sempre começa em zero. Sempre varia em acréscimos de 1.
   * @return revisao
  **/
  @Nullable
  @ApiModelProperty(value = "Revisão da cobrança. Sempre começa em zero. Sempre varia em acréscimos de 1.")
  @JsonProperty(JSON_PROPERTY_REVISAO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRevisao() {
    return revisao;
  }


  public void setRevisao(Integer revisao) {
    this.revisao = revisao;
  }


  public CobGeradaAllOf location(URI location) {
    
    this.location = location;
    return this;
  }

   /**
   * Localização do Payload a ser informada na criação da cobrança.
   * @return location
  **/
  @Nullable
  @ApiModelProperty(example = "pix.example.com/qr/2353c790-eefb-11ea-adc1-0242ac120002", value = "Localização do Payload a ser informada na criação da cobrança.")
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getLocation() {
    return location;
  }


  public void setLocation(URI location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CobGeradaAllOf cobGeradaAllOf = (CobGeradaAllOf) o;
    return Objects.equals(this.calendario, cobGeradaAllOf.calendario) &&
        Objects.equals(this.status, cobGeradaAllOf.status) &&
        Objects.equals(this.txid, cobGeradaAllOf.txid) &&
        Objects.equals(this.revisao, cobGeradaAllOf.revisao) &&
        Objects.equals(this.location, cobGeradaAllOf.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendario, status, txid, revisao, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CobGeradaAllOf {\n");
    sb.append("    calendario: ").append(toIndentedString(calendario)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    revisao: ").append(toIndentedString(revisao)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

