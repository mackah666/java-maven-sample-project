package com.mycompany.app;

import org.junit.Test;

import java.sql.PreparedStatement;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    int result = 0;
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void shouldAnswerWithFalse()
    {
        assertFalse( false );
    }


    @Test
    public void shouldAnsweris()
    {
        assertEquals( 0, result);
    }
}
