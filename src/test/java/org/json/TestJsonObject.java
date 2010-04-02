package org.json;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestJsonObject extends TestCase
{
    public void testIgnoreComments() throws Exception
    {
        final JSONObject obj = new JSONObject("// this is a comment\n{\"a\":200}");

        Assert.assertEquals(1, obj.length());
        Assert.assertTrue(obj.has("a"));
        Assert.assertEquals(obj.getInt("a"), 200);
    }
}
