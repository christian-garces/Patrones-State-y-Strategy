/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronstate;

/**
 *
 * @author salas
 */
public class LockState extends PatronState{
    
  LockState(User user) {
    super(user);
  }

  @Override
  public String onActive() {
    return "Locked...";
  }
  @Override
  public String onDisable() {
    return "Locked...";
  }
  @Override
  public String onLock() {
    if (user.isBuying()){
      user.changeState(new DisableState(user));
      return "Locked...";
    }
    if (user.getEnable()){
      user.changeState(new DisableState(user));
      return "Disabled...";
    }
    user.changeState(new ActiveState(user));
    return "Locked...";
  }
  @Override
  public String onBuy() {
    return "Locked...";
  }
}
