package net.ffab.abstractfactory.plugin;

public class FactoryImplB implements AbstractFactory{
    @Override
    public AbstractPlugin getInstance() {
        return new PluginIImplB();
    }
}
