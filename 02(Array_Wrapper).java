class ArrayWrapper {
    constructor(nums) {
        this.nums = nums;
    }

    // Used by String(obj) and obj.toString()
    toString() {
        return `[${this.nums.join(',')}]`;
    }

    // Used when obj1 + obj2 is evaluated
    valueOf() {
        return this.nums.reduce((sum, num) => sum + num, 0);
    }
}
 