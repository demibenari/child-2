package demibenari.model.guice.modules;

import com.google.inject.AbstractModule;
import demibenari.model.ModelContainer;
import demibenari.model.ModelContainerImpl;

/**
 *
 * Created by Demi on 12/13/2014.
 */
public class ModelModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ModelContainer.class).to(ModelContainerImpl.class);
    }
}
