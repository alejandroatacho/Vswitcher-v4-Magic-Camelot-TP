int alchItemId = 554;
ItemComposition itemComp = client.getItemComposition(alchItemId);
 v.getCallbacks().afterTicks(1, () -> {
  if(itemComp != null) {
  v.getCombat().spell(Spell.HIGH_LEVEL_ALCHEMY);
  v.invoke("Cast","<col=00ff00>High Level Alchemy</col><col=ffffff> -> <col=ff9040>"+itemComp.getName()+"</col>",0,58,v.getInventory().slot(alchItemId),9764864,false);
}

    });
    v.getCombat().spell(Spell.CAMELOT_TELEPORT);
    

