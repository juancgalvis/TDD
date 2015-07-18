package codebreakertest;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.CodeBreaker;


public class codeBreakerTest {
	private String numeroPrueba = "2561";
	//xxxx,xxx,xx,x, ,----,---,--,-,x---,x--,x-,xx--,xx-
	public String resultado;
	public CodeBreaker code=new CodeBreaker();
	@Test
	public void xxxx() {
		resultado=code.validar(numeroPrueba,"2561");
		assertEquals("xxxx", resultado);
	}
	@Test
	public void xxx() {
		resultado=code.validar(numeroPrueba,"2501");
		assertEquals("xxx", resultado);
	}
	@Test
	public void xx() {
		resultado=code.validar(numeroPrueba,"2301");
		assertEquals("xx", resultado);
	}
	@Test
	public void x() {
		resultado=code.validar(numeroPrueba,"7801");
		assertEquals("x", resultado);
	}
	@Test
	public void nada() {
		resultado=code.validar(numeroPrueba,"3478");
		assertEquals("", resultado);
	}
	@Test
	public void cuatrorayas() {
		resultado=code.validar(numeroPrueba,"1652");
		assertEquals("----", resultado);
	}
	@Test
	public void tresrayas() {
		resultado=code.validar(numeroPrueba,"1653");
		assertEquals("---", resultado);
	}
	@Test
	public void dosrayas() {
		resultado=code.validar(numeroPrueba,"1643");
		assertEquals("--", resultado);
	}
	@Test
	public void unarayas() {
		resultado=code.validar(numeroPrueba,"1943");
		assertEquals("-", resultado);
	}
	@Test
	public void xtresrayas() {
		resultado=code.validar(numeroPrueba,"2156");
		assertEquals("x---", resultado);
	}
	@Test
	public void xdosrayas() {
		resultado=code.validar(numeroPrueba,"2154");
		assertEquals("x--", resultado);
	}	
	@Test
	public void xunarayas() {
		resultado=code.validar(numeroPrueba,"2134");
		assertEquals("x-", resultado);
	}
	@Test
	public void dosXdosRayas() {
		resultado=code.validar(numeroPrueba,"2516");
		assertEquals("xx--", resultado);
	}
	@Test
	public void dosXUnaRaya() {
		resultado=code.validar(numeroPrueba,"2536");
		assertEquals("xx-", resultado);
	}
	@Test
	public void testLetra() {//2561
		resultado=code.validar(numeroPrueba,"w5rj");
		assertEquals("x", resultado);
	}
}
