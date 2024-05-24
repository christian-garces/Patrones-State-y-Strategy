/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronstate;

/**
 *
 * @author salas
 */
public abstract class PatronState {

  User user;
  PatronState(User user) {
    this.user = user;
  }
  public abstract String onActive();
  public abstract String onDisable();
  public abstract String onLock();
  public abstract String onBuy();
}
