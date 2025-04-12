crafting.remove('trashcans:item_trash_can')
crafting.remove('trashcans:liquid_trash_can')
crafting.remove('trashcans:energy_trash_can')
crafting.remove('trashcans:ultimate_trash_can')

crafting.addShaped(item('trashcans:ultimate_trash_can'), 
[
    [null, item('trashcans:item_trash_can'), null], 
    [item('trashcans:energy_trash_can'), null, item('trashcans:liquid_trash_can')], 
    [null, null, null]
])

crafting.addShaped(item('trashcans:liquid_trash_can'), 
[
    [null, ore('plateSteel'), null], 
    [ore('plateSteel'), item('gregtech:mte', 1612), ore('plateSteel')], 
    [null, null, null]
])

crafting.addShaped(item('trashcans:energy_trash_can'), 
[
    [null, ore('plateSteel'), null], 
    [ore('plateSteel'), ore('stickLongCopper'), ore('plateSteel')], 
    [null, null, null]
])

crafting.addShaped(item('trashcans:item_trash_can'), 
[
    [null, ore('plateSteel'), null], 
    [ore('plateSteel'), item('gregtech:mte', 1627), ore('plateSteel')], 
    [null, null, null]
])