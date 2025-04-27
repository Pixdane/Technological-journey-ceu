crafting.removeByOutput(item('apotheosis:hellshelf'))

crafting.addShaped(item('apotheosis:hellshelf'), [
        [item('minecraft:nether_brick'), ore('logWood'), item('minecraft:nether_brick')],
        [ore('craftingBook'), ore('craftingBook'), ore('craftingBook')],
        [item('minecraft:nether_brick'), ore('logWood'), item('minecraft:nether_brick')]
])

crafting.addShaped(item('apotheosis:hellshelf'), [
        [item('minecraft:nether_brick'), item('minecraft:nether_brick'), item('minecraft:nether_brick')],
        [null, item('minecraft:bookshelf'), null],
        [item('minecraft:nether_brick'), item('minecraft:nether_brick'), item('minecraft:nether_brick')]
])

crafting.addShaped(item('minecraft:enchanted_book').withNbt(['StoredEnchantments': [['id': (short) 45, 'lvl': (short) 1]]]), [
        [item('minecraft:red_nether_brick'), item('minecraft:netherrack'), item('minecraft:red_nether_brick')],
        [item('minecraft:netherrack'), ore('craftingBook'), item('minecraft:netherrack')],
        [item('minecraft:nether_brick'), item('minecraft:netherrack'), item('minecraft:nether_brick')]
])
