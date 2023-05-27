<template>
  <div class="input-group mb-3">
    <input type="text" class="form-control " placeholder="입력해주세요" maxlength="30" size="30">
    <button @click="add" @change="inputTodo" class="btn btn-danger" type="button" id="button-addon1">등록</button>
  </div>

  <ul class="list-group">
    <li class="list-group-item" v-for="i in count" :key="i">
      <input class="form-check-input me-1 check" type="checkbox" value="" id="firstCheckboxStretched">

      {{ i }} 
      <!-- 왜 v-for의 key  값이 1 부터 시작해?  -->
      <p class="todoText">{{ posts[i].contents }}</p>
      <div class="btnMix">
        <input type="submit" class="btn btn-danger todoFix" value="수정">
        <input type="submit" class="btn btn-danger todoDelete" value="삭제">
      </div>
    </li>
  </ul>
  
</template>

<script>

export default {
  name : 'Container',
  props : {
    posts  : Array,
    count : Number,
  },
  data(){
    return {
      text : '',
      inputText : '',
    }
  },
  methods :{
    inputTodo(e){
      return this.inputText = e.target.value
    },
    add(){
      this.$emit('plus',this.text)
      return this.text = this.inputText
    }
  }

}
</script>

<style>
.plus {
  margin-bottom: 5px;
}
.btn-light{
  display: flex;
  border-color: gray;
  border-radius: 100%;
  border-width: 3px;
  color : gray;
  font-weight: 1000;
}

.list-group{
  position: relative;
}

.check {
  float: left;
  margin-top: 10px;
}
.todoText{
  border: none;
  float: left;
  margin-left: 5px;
}
.todoText:focus{
  outline: none;
}

.todoAdd{

}

.btnMix{
  float: right;
}
.btnMix > input {
  margin-left: 5px;
}
</style>