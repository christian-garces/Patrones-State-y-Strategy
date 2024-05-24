/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronstate;

/**
 *
 * @author salas
 */
public class ActiveState extends PatronState{
    public ActiveState(User user) {
    super(user);
  }

  @Override
  public String onActive() {
    user.changeState(new BuyingState(user));
    return "Actived ...";
  }
  @Override
  public String onDisable() {
    user.changeState(new DisableState(user));
    return "Disabled...";
  }
  @Override
  public String onLock() {
    user.changeState(new LockState(user));
    return "Locked...";
  }
  @Override
  public String onBuy() {
    String action = user.startBuy();
    user.changeState(new BuyingState(user));
    return action;
  }
}
