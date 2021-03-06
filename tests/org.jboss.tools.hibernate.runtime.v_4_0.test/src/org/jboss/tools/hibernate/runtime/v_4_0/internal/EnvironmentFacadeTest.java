package org.jboss.tools.hibernate.runtime.v_4_0.internal;

import org.hibernate.cfg.Environment;
import org.jboss.tools.hibernate.runtime.common.AbstractEnvironmentFacade;
import org.jboss.tools.hibernate.runtime.common.IFacadeFactory;
import org.jboss.tools.hibernate.runtime.spi.IEnvironment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class EnvironmentFacadeTest {

	private static final IFacadeFactory FACADE_FACTORY = new FacadeFactoryImpl();
	
	private IEnvironment environmentFacade = null; 
	
	@Before
	public void setUp() throws Exception {
		environmentFacade = new AbstractEnvironmentFacade(FACADE_FACTORY, null) {};
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetTransactionManagerStrategy() {
		Assert.assertEquals(
				Environment.TRANSACTION_MANAGER_STRATEGY, 
				environmentFacade.getTransactionManagerStrategy());
	}
	
	@Test
	public void testGetDriver() {
		Assert.assertEquals(
				Environment.DRIVER, 
				environmentFacade.getDriver());
	}
	
	@Test
	public void testGetHBM2DDLAuto() {
		Assert.assertEquals(
				Environment.HBM2DDL_AUTO, 
				environmentFacade.getHBM2DDLAuto());
	}
	
	@Test
	public void testGetDialect() {
		Assert.assertEquals(
				Environment.DIALECT, 
				environmentFacade.getDialect());
	}
	
	@Test
	public void testGetDataSource() {
		Assert.assertEquals(
				Environment.DATASOURCE, 
				environmentFacade.getDataSource());
	}
	
	@Test
	public void testGetConnectionProvider() {
		Assert.assertEquals(
				Environment.CONNECTION_PROVIDER, 
				environmentFacade.getConnectionProvider());
	}
	
	@Test
	public void testGetURL() {
		Assert.assertEquals(
				Environment.URL, 
				environmentFacade.getURL());
	}
	
	@Test
	public void testGetUser() {
		Assert.assertEquals(
				Environment.USER, 
				environmentFacade.getUser());
	}
	
	@Test
	public void testGetPass() {
		Assert.assertEquals(
				Environment.PASS, 
				environmentFacade.getPass());
	}
	
	@Test
	public void testGetSessionFactoryName() {
		Assert.assertEquals(
				Environment.SESSION_FACTORY_NAME, 
				environmentFacade.getSessionFactoryName());
	}
	
	@Test
	public void testGetDefaultCatalog() {
		Assert.assertEquals(
				Environment.DEFAULT_CATALOG, 
				environmentFacade.getDefaultCatalog());
	}
	
	@Test
	public void testGetDefaultSchema() {
		Assert.assertEquals(
				Environment.DEFAULT_SCHEMA, 
				environmentFacade.getDefaultSchema());
	}
	
	@Test
	public void testWrappedClass() {
		Assert.assertSame(
				Environment.class, 
				environmentFacade.getWrappedClass());
	}
	
}
