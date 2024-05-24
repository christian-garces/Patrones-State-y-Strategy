/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronstate;

/**
 *
 * @author salas
 */
public class BuyingState extends PatronState{
    
  BuyingState(User user) {
    super(user);
    user.setBuying(true);
  }
  
  @Override
  public String onActive() {
    user.changeState(new ActiveState(user));
    return "Active...";
  }
  @Override
  public String onDisable() {
    user.changeState(new DisableState(user));
    return "Stop buying";  }
  @Override
  public String onLock() {
    user.changeState(new LockState(user));
    return "Stop buying";
  }
  @Override
  public String onBuy() {
    user.changeState(new BuyingState(user));
    return "buying";
  }
}
