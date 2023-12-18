package net.ffab.abstractfactory.plugin;

public class FactoryImplA implements AbstractFactory{
    @Override
    public AbstractPlugin getInstance() {
        return new PluginIImplA();
    }
}
