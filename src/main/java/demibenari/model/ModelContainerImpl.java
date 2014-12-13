package demibenari.model;

import com.google.inject.Inject;
import demibenari.common.configuration.ConfigProvider;
import demibenari.common.entities.Item;
import demibenari.common.observers.AbstractSubjet;
import demibenari.common.observers.ItemsObserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Demi on 12/13/2014.
 */
public class ModelContainerImpl extends AbstractSubjet<ItemsObserver> implements ModelContainer {
    private List<Item> items;

    @Inject
    private ConfigProvider configProvider;

    public ModelContainerImpl() {
        items = new ArrayList<>();
    }

    @Override
    public List<Item> getAllItems() {
        return items;
    }

    @Override
    public void addItems(List<Item> items) {
        items.addAll(items);
    }

    @Override
    public void removeItems(List<Item> items) {
        items.removeAll(items);
    }
}
