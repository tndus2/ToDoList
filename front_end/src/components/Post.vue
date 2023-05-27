<template>
  <ul class="list-group">
    <li class="list-group-item" v-for="i in count" :key="i">
      <input class="form-check-input me-1 check" type="checkbox" value="" id="firstCheckboxStretched">
      <!-- <label class="form-check-label stretched-link" for="firstCheckboxStretched">{{connectData}}</label> -->
      <!-- <input type="text" class="todoText" :value="inputText" maxlength="30" size="30" readonly> -->
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
    name : 'Post',
    props :{
        posts : Array,
    }
}
</script>

<style>

</style>