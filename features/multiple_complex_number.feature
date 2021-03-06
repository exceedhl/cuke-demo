# language: zh-CN
功能:复数相乘
作为一个数学家
我想实现复数的相乘功能  # z1 * z2＝(a＋bi) (c＋di)＝(ac－bd)＋(bc＋ad)i
以便我能够得到两个复数的积

场景: 复数和0相乘
    假如有以下复数，实部和虚部分别为：
		|real|virtual|
		|3|2|
		|0|0|
    当它们相乘后
    那么我应该得到一个实部为0虚部为0的复数

场景: 两个非零复数相乘
    假如有以下复数，实部和虚部分别为：
		|real|virtual|
		|3|2|
		|1|4|
    当它们相乘后
    那么我应该得到一个实部为-3虚部为14的复数

场景: 多个复数相乘
    假如有以下复数，实部和虚部分别为：
		|real|virtual|
		|3|2|
		|1|4|
		|3|0|
    当它们相乘后
    那么我应该得到一个实部为-9虚部为42的复数