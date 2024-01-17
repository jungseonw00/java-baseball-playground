---
com / user
123, 456 -> nothing
123, 245 -> 1ball
123, 145 -> 1strike

PlayResult result = BaseBall.play(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));

---

### 위치값 포함 (위치값, 값)
- com / user
- 1 4 , 1 4 -> 1strike
- 1 4 , 2 4 -> ball
- 1 4 , 2 5 -> nothing

###