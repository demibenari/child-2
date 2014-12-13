package demibenari.model;

import demibenari.common.entities.Item;
import demibenari.common.observers.ItemsObserver;
import demibenari.common.observers.Subjet;

import java.util.List;

public interface ModelContainer extends Subjet<ItemsObserver> {
    public List<Item> getAllItems();

    public void addItems(List<Item> items);
    public void removeItems(List<Item> items);
}