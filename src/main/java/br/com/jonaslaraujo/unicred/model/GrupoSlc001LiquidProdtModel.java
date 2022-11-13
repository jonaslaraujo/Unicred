package br.com.jonaslaraujo.unicred.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GRUPOSLC001LIQUIDPRODT")
public class GrupoSlc001LiquidProdtModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String identLinhaBilat;
    private String tpDebCred;
    private Integer iSPBIFCredtd;
    private Integer iSPBIFDebtd;
    private Double vlrLanc;
    private String cnpjLiqdantDebtd;
    private String nomeLiquidantDebtd;
    private String cnpjLiqdantCredtd;
    private String nomeLiquidantCredtd;
    private String tptransacSlc;

    @ManyToOne
    @JoinColumn(name = "idGrupoSlc0001Liquid")
    private GrupoSlc001LiquidModel grupoSlc001LiquidModel;

    @ManyToOne
    @JoinColumn(name = "idGrupoSlc0001Prodt")
    private GrupoSlc001ProdtModel grupoSlc001ProdtModel;
}
