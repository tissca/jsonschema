package cu.tissca.commons.jsonschema.parser;

import cu.tissca.commons.jsonschema.model.JsonStringSchema;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 *
 * @author ariel.viera@gmail.com (Ariel Viera)
 */
public class JsonHyperSchemaTestCase {

    /**
     *  this test is to mark that hyperschema specific things has not yet been added to this implementation.
     * @throws NoSuchFieldException
     */
    @Test(expected = NoSuchFieldException.class)
    public void testNoMediaPropertyHasBeenDefined() throws NoSuchFieldException {
        Field media = JsonStringSchema.class.getDeclaredField("media");
    }
}
