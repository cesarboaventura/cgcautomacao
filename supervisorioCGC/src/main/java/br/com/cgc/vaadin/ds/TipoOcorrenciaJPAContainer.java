package br.com.cgc.vaadin.ds;

import javax.persistence.EntityManager;

import br.com.cgc.vaadin.model.TipoOcorrencia;

import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;
import com.vaadin.addon.jpacontainer.provider.CachingMutableLocalEntityProvider;

/**
 * Define o componente responsável por solicitar e manter os dados da 
 * <code>TipoOcorrencia</code> em conjunto com o mecanismo de persistência.
 *
 * <p>Utiliza a API do <i>add-on</i> <code>JPAContainer</code> para disponilizar as operações de persistência.</p>
 * 
 * <p>Seu uso abstrai o controle da camada de persistência com os componentes visuais (<code>Table</code> por exemplo).</p>
 * 
 * @author CGC Automação
 */
public class TipoOcorrenciaJPAContainer extends JPAContainer<TipoOcorrencia> {

	private static final long serialVersionUID = 5832996438848438038L;

	/**
	 * Nome da unidade persistencia. De acordo com o arquivo <code>persistence.xml</code>.
	 */
	private static final String PERSISTENCE_UNIT = "appCGCUnit"; 
	
	public TipoOcorrenciaJPAContainer() {
		super(TipoOcorrencia.class);
		EntityManager em = JPAContainerFactory.createEntityManagerForPersistenceUnit(PERSISTENCE_UNIT); 
		setEntityProvider(new CachingMutableLocalEntityProvider<TipoOcorrencia>(TipoOcorrencia.class, em));
	}
	
}
