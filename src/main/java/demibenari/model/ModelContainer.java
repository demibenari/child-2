package demibenari.model;

import demibenari.common.entities.Item;
import demibenari.common.observers.ItemsObserver;
import demibenari.common.observers.Subjet;

import java.util.List;

/**
 *
 * Created by Demi Ben-Ari on 12/13/2014.
 */
public interface ModelContainer extends Subjet<ItemsObserver> {
    public List<Item> getAllItems();

    public void addItems(List<Item> items);
    public void removeItems(List<Item> items);
}